package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1datasets~1app-rankings/get/parameters/1/schema
 */
@Serializable(with = InlineDatasetsAppRankingsGetParameterX0426a5ba.Serializer::class)
public sealed class InlineDatasetsAppRankingsGetParameterX0426a5ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cli-agent`.
   */
  public data object CliAgent : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "cli-agent"
  }

  /**
   * Documented value. Wire value: `ide-extension`.
   */
  public data object IdeExtension : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "ide-extension"
  }

  /**
   * Documented value. Wire value: `cloud-agent`.
   */
  public data object CloudAgent : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "cloud-agent"
  }

  /**
   * Documented value. Wire value: `programming-app`.
   */
  public data object ProgrammingApp : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "programming-app"
  }

  /**
   * Documented value. Wire value: `native-app-builder`.
   */
  public data object NativeAppBuilder : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "native-app-builder"
  }

  /**
   * Documented value. Wire value: `creative-writing`.
   */
  public data object CreativeWriting : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "creative-writing"
  }

  /**
   * Documented value. Wire value: `video-gen`.
   */
  public data object VideoGen : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "video-gen"
  }

  /**
   * Documented value. Wire value: `image-gen`.
   */
  public data object ImageGen : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "image-gen"
  }

  /**
   * Documented value. Wire value: `audio-gen`.
   */
  public data object AudioGen : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "audio-gen"
  }

  /**
   * Documented value. Wire value: `roleplay`.
   */
  public data object Roleplay : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "roleplay"
  }

  /**
   * Documented value. Wire value: `game`.
   */
  public data object Game : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "game"
  }

  /**
   * Documented value. Wire value: `writing-assistant`.
   */
  public data object WritingAssistant : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "writing-assistant"
  }

  /**
   * Documented value. Wire value: `general-chat`.
   */
  public data object GeneralChat : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "general-chat"
  }

  /**
   * Documented value. Wire value: `personal-agent`.
   */
  public data object PersonalAgent : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "personal-agent"
  }

  /**
   * Documented value. Wire value: `legal`.
   */
  public data object Legal : InlineDatasetsAppRankingsGetParameterX0426a5ba() {
    public override val `value`: String = "legal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDatasetsAppRankingsGetParameterX0426a5ba()

  public companion object {
    public fun fromValue(`value`: String): InlineDatasetsAppRankingsGetParameterX0426a5ba = when (value) {
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

  internal object Serializer : KSerializer<InlineDatasetsAppRankingsGetParameterX0426a5ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineDatasetsAppRankingsGetParameterX0426a5ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDatasetsAppRankingsGetParameterX0426a5ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDatasetsAppRankingsGetParameterX0426a5ba) {
      encoder.encodeString(value.value)
    }
  }
}
