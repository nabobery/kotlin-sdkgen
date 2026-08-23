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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/service_typ
 * e.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/service_typ
 * e
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a.Serializer::class)
public sealed class InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `full_service`.
   */
  public data object FullService : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a() {
    public override val `value`: String = "full_service"
  }

  /**
   * Documented value. Wire value: `non_fuel_transaction`.
   */
  public data object NonFuelTransaction : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a() {
    public override val `value`: String = "non_fuel_transaction"
  }

  /**
   * Documented value. Wire value: `self_service`.
   */
  public data object SelfService : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a() {
    public override val `value`: String = "self_service"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a = when (value) {
      FullService.value -> FullService
      NonFuelTransaction.value -> NonFuelTransaction
      SelfService.value -> SelfService
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a) {
      encoder.encodeString(value.value)
    }
  }
}
