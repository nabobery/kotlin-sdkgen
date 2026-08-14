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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/business_name/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/business_name/anyOf/1
 */
@Serializable(with = InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormBusinessNameAnyOf2X840e21fd) {
      encoder.encodeString(value.value)
    }
  }
}
