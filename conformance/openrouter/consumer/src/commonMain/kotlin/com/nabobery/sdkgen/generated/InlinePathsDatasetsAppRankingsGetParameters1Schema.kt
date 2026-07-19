package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Marketplace subcategory to filter by (e.g. `cli-agent`). Takes precedence over `category` for the actual filter; when
 * `category` is also supplied the pair must be consistent.
 */
@Serializable(with = InlinePathsDatasetsAppRankingsGetParameters1Schema.Serializer::class)
public sealed class InlinePathsDatasetsAppRankingsGetParameters1Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cli-agent`.
   */
  public data object CliAgent : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "cli-agent"
  }

  /**
   * Documented value. Wire value: `ide-extension`.
   */
  public data object IdeExtension : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "ide-extension"
  }

  /**
   * Documented value. Wire value: `cloud-agent`.
   */
  public data object CloudAgent : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "cloud-agent"
  }

  /**
   * Documented value. Wire value: `programming-app`.
   */
  public data object ProgrammingApp : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "programming-app"
  }

  /**
   * Documented value. Wire value: `native-app-builder`.
   */
  public data object NativeAppBuilder : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "native-app-builder"
  }

  /**
   * Documented value. Wire value: `creative-writing`.
   */
  public data object CreativeWriting : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "creative-writing"
  }

  /**
   * Documented value. Wire value: `video-gen`.
   */
  public data object VideoGen : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "video-gen"
  }

  /**
   * Documented value. Wire value: `image-gen`.
   */
  public data object ImageGen : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "image-gen"
  }

  /**
   * Documented value. Wire value: `audio-gen`.
   */
  public data object AudioGen : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "audio-gen"
  }

  /**
   * Documented value. Wire value: `roleplay`.
   */
  public data object Roleplay : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "roleplay"
  }

  /**
   * Documented value. Wire value: `game`.
   */
  public data object Game : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "game"
  }

  /**
   * Documented value. Wire value: `writing-assistant`.
   */
  public data object WritingAssistant : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "writing-assistant"
  }

  /**
   * Documented value. Wire value: `general-chat`.
   */
  public data object GeneralChat : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "general-chat"
  }

  /**
   * Documented value. Wire value: `personal-agent`.
   */
  public data object PersonalAgent : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "personal-agent"
  }

  /**
   * Documented value. Wire value: `legal`.
   */
  public data object Legal : InlinePathsDatasetsAppRankingsGetParameters1Schema() {
    public override val `value`: String = "legal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsDatasetsAppRankingsGetParameters1Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsDatasetsAppRankingsGetParameters1Schema = when (value) {
      CliAgent.value -> CliAgent
      IdeExtension.value -> IdeExtension
      CloudAgent.value -> CloudAgent
      ProgrammingApp.value -> ProgrammingApp
      NativeAppBuilder.value -> NativeAppBuilder
      CreativeWriting.value -> CreativeWriting
      VideoGen.value -> VideoGen
      ImageGen.value -> ImageGen
      AudioGen.value -> AudioGen
      Roleplay.value -> Roleplay
      Game.value -> Game
      WritingAssistant.value -> WritingAssistant
      GeneralChat.value -> GeneralChat
      PersonalAgent.value -> PersonalAgent
      Legal.value -> Legal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsDatasetsAppRankingsGetParameters1Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsDatasetsAppRankingsGetParameters1Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsDatasetsAppRankingsGetParameters1Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsDatasetsAppRankingsGetParameters1Schema) {
      encoder.encodeString(value.value)
    }
  }
}
