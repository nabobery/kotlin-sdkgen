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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/customer_mapping/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/customer_mapping/properties/type
 */
@Serializable(with = InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8.Serializer::class)
public sealed class InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `by_id`.
   */
  public data object ById : InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8() {
    public override val `value`: String = "by_id"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8 = when (value) {
      ById.value -> ById
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8) {
      encoder.encodeString(value.value)
    }
  }
}
