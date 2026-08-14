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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/get/responses/200/content/application~1json/schema/p
 * roperties/object
 */
@Serializable(with = InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042.Serializer::class)
public sealed class InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsGetResponse200JsonObjectValueX1221c042) {
      encoder.encodeString(value.value)
    }
  }
}
