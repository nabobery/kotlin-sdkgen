package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters~1{id}~1event_summaries/get/responses/200/content/applicatio
 * n~1json/schema/properties/object
 */
@Serializable(with = InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02.Serializer::class)
public sealed class InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMetersEventSummariesGetResponse200JsonObjectValueXbf6eff02) {
      encoder.encodeString(value.value)
    }
  }
}
