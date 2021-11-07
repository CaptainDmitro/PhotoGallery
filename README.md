# PhotoGallery
This is just a tutorial project standing for fetching and displaying photos from [Flickr](https://flickr.com/ "Flickr - online photo gallery").
<video src='https://user-images.githubusercontent.com/48180766/140659268-fe84a271-175d-4d65-a9d8-22f1ee8c0b9e.mov'/>

### What used:
- **RecyclerView** along with **Fragments** are used for display numerous (potentially) images utilizing minimal possible memory usage;
- **Retrofit**, **OkHttp** and **Gson** libraries for image fetching;
- To segregate data dependency from activity lifecycle **ViewModel** and **LiveData** were applied;
- **WebView** to create an embedded looking browser instance.

### Features
- Images can be discovered with search bar at the top of the app:
  <video src='https://user-images.githubusercontent.com/48180766/140659447-7dfaf670-d7c7-4cf4-8bde-638bccbc4752.mov'/>
- Search query can be cleared and Flickr's 'interesting' photos will be shown:
  <video src='https://user-images.githubusercontent.com/48180766/140659391-6794ed5d-d456-4b7b-91ff-295dc21213ec.mov'/>
- Tap on photo to open full size version on Flickr site;
  <video src='https://user-images.githubusercontent.com/48180766/140662426-8771e3a6-f255-4041-b4be-b651e90b8f7c.mov'/>
- Latest search query is saved and restored on app restart:
  <video src='https://user-images.githubusercontent.com/48180766/140659423-d95084fd-5514-416e-b1ff-d738babf4193.mov'/>
- If new photos related to saved search query are found a notification is shown (can be toggled by "Start/stop polling" in options menu):
  <video src='https://user-images.githubusercontent.com/48180766/140659432-78d1d12a-cb04-4b7b-8736-38cd8eab5b7d.mov'/>
