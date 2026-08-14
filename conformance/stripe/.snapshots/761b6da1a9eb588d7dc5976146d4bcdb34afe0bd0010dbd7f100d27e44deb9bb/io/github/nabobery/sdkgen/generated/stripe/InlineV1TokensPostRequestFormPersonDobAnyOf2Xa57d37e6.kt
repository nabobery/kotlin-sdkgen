package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/dob/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/dob/anyOf/1
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6.Serializer::class)
public sealed class InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6) {
      encoder.encodeString(value.value)
    }
  }
}
