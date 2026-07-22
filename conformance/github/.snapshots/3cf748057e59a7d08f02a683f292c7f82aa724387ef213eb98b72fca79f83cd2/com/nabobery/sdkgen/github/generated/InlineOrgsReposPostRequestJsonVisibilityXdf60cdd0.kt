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
 * The visibility of the repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/post/requestBody/content/application~1json/schema/properties
 * /visibility
 */
@Serializable(with = InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0.Serializer::class)
public sealed class InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0() {
    public override val `value`: String = "private"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0 = when (value) {
      Public.value -> Public
      Private.value -> Private
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposPostRequestJsonVisibilityXdf60cdd0) {
      encoder.encodeString(value.value)
    }
  }
}
