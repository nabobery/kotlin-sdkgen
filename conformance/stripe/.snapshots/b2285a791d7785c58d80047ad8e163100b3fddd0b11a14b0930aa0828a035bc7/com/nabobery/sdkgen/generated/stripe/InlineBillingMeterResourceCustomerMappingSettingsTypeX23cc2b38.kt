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
 * The method for mapping a meter event to a customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_meter_resource_customer_mapping_settings/properties/type
 */
@Serializable(with = InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38.Serializer::class)
public sealed class InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `by_id`.
   */
  public data object ById : InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38() {
    public override val `value`: String = "by_id"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38 = when (value) {
      ById.value -> ById
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingMeterResourceCustomerMappingSettingsTypeX23cc2b38) {
      encoder.encodeString(value.value)
    }
  }
}
