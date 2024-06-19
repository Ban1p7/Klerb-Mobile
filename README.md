# Klerb mobile
A klerb game in java using libGDX

#### [My itch page](https://nebjs.itch.io)
#### [Original klerb](https://nebjs.itch.io/klerb)
#### [Klerb 2](https://nebjs.itch.io/klerb2)

## Quick description
I feel I don't really need to be more descriptive than that. You can play it, I guess. Just run `git clone https://github.com/Ban1p7/klerb-clone-java.git` then navigate there in your file browser and run `./gradlew desktop:run`. Or do something similar with the gradle.bat file if you're on Windows, I've never used it and just kept it in for compatability. You do need to have a version of a JDK installed for it to work, I'm on Java 21.0.3 2024-04-16 LTS, but others probably work too. Uhh, yeah. That's about it.


## How to build
Use gradle.

### Linux
```
git clone https://github.com/Ban1p7/klerb-clone-java.git
cd klerb-clone-java
chmod +x gradlew
./gradlew desktop:run
```
### Windows
On windows I'd assume it's the following, but I don't really have any idea.
```
git clone https://github.com/Ban1p7/klerb-clone-java.git
cd klerb-clone-java
./gradle.bat desktop:run
```
### MacOS
No idea
### FreeBSD
I should've stopped listing operating systems, I have no idea
### Anything else
Go to [the libGDX site](https://libgdx.com) and figure it out on your own. I believe in you.


## License
Whatever license is in the LICENSE file is my license for all the code that I've made, but the gradlew and gradlew.bat and build.gradle files might have their own
licenses (?), I just generated it all from the [libGDX project creator](https://libgdx.com), though I guess the gradlew and gradlew.bat would be [gradlew's](https://gradle.org/).
The point is, they're not mine; I'm not claiming that anything related to the build system is mine. Also, any platform-specific code, like in the android, desktop, html, etc. folders
was generated also by the libGDX project creator.\
The font in the title screen is [pixeloid mono](https://www.fontspace.com/pixeloid-font-f69232) -- License: SIL Open Font License (OFL).\
Ingame background music (assets/notmyassets/background-music.mp3) is "[retro crime movie beat.wav](https://freesound.org/s/388389/)" by zagi2 -- License: Attribution NonCommercial 4.0\
Menu music (klerb\_theme.mp3) is made by me using [online sequencer](https://onlinesequencer.net/) -- License: Creative Commons Attribution Share Alike 4.0 International (see assets/myassetslicense)\
All the parralax space background stuff is made by [ansimuz](https://opengameart.org/users/ansimuz), I found it on [opengameart](https://opengameart.org/content/space-background-3)
-- License: Creative Commons 0 (see assets/notmyassets/spacebackground/license.txt)\
All image assets outside of the assets/notmyassets folder were made by me in GIMP -- License: Creative Commons Attribution Share Alike 4.0 International (see assets/myassetslicense)\
Also note that the myassetslicense does not apply to any assets used that are in the assets/notmyassets folder, or any assets that have their license otherwise stated above.\
If I used your asset and you want me to remove it, please tell me and I'll replace it with a different one.


## Can you contribute?
Nope. You can fork it, if you want for some reason, or you can contribute image/sound effects/music assets, that sort of thing, but because I'm making this for fun,
I'm not accepting code contributions. Not that I'd imagine anyone wants to make my game for me anyway, since anyone with that ability would surely just make their
own game, because if an idiot like me can do it, it'd be a piece of cake for anyone else. And this is just a clone of a game anyway, not even the original, I should
probably specify that.
