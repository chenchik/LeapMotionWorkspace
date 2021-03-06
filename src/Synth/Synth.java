package Synth;
import javax.sound.midi.*;
import com.jsyn.*;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.SawtoothOscillator;

public class Synth {
public static void main(String[] args) {
		System.out.println("poop");

	MidiDevice.Info[] devices = MidiSystem.getMidiDeviceInfo();

	if (devices.length == 0) {
		System.out.println("poop");
	}
	else {
		    for (MidiDevice.Info dev : devices) {
        System.out.println(dev);
    }
	try {
	Synthesizer synth = JSyn.createSynthesizer();
	synth.start();

	SawtoothOscillator mySynth;
	synth.add(mySynth= new SawtoothOscillator());

	mySynth.frequency.set(440.0);
	myOsc.apitude.set(0.5);

	final MidiChannel[] mc = synth.getChannels();

	Instrument[] instr = synth.getDefaultSoundbank().getInstruments();

	synth.loadInstrument(instr[90]);
	mc[5].noteOn(60,600);
	}
	}

}
}