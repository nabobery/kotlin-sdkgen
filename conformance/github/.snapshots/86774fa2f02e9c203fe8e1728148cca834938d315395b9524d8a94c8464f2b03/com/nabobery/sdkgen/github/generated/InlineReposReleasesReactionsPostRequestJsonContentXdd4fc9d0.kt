package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the release.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1{release_id}~1reactions/post/requestBody/cont
 * ent/application~1json/schema/properties/content
 */
@Serializable(with = InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0.Serializer::class)
public sealed class InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `+1`.
   */
  public data object _1 : InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0() {
    public override val `value`: String = "+1"
  }

  /**
   * Documented value. Wire value: `laugh`.
   */
  public data object Laugh : InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0() {
    public override val `value`: String = "laugh"
  }

  /**
   * Documented value. Wire value: `heart`.
   */
  public data object Heart : InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0() {
    public override val `value`: String = "heart"
  }

  /**
   * Documented value. Wire value: `hooray`.
   */
  public data object Hooray : InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0() {
    public override val `value`: String = "hooray"
  }

  /**
   * Documented value. Wire value: `rocket`.
   */
  public data object Rocket : InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0() {
    public override val `value`: String = "rocket"
  }

  /**
   * Documented value. Wire value: `eyes`.
   */
  public data object Eyes : InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0() {
    public override val `value`: String = "eyes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0()

  public companion object {
    public fun fromValue(`value`: String): InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0 = when (value) {
      _1.value -> _1
      Laugh.value -> Laugh
      Heart.value -> Heart
      Hooray.value -> Hooray
      Rocket.value -> Rocket
      Eyes.value -> Eyes
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0) {
      encoder.encodeString(value.value)
    }
  }
}
