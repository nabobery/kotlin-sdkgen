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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/service_t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/service_t
 * ype
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee.Serializer::class)
public sealed class InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `full_service`.
   */
  public data object FullService : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee() {
    public override val `value`: String = "full_service"
  }

  /**
   * Documented value. Wire value: `non_fuel_transaction`.
   */
  public data object NonFuelTransaction : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee() {
    public override val `value`: String = "non_fuel_transaction"
  }

  /**
   * Documented value. Wire value: `self_service`.
   */
  public data object SelfService : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee() {
    public override val `value`: String = "self_service"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee = when (value) {
      FullService.value -> FullService
      NonFuelTransaction.value -> NonFuelTransaction
      SelfService.value -> SelfService
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee) {
      encoder.encodeString(value.value)
    }
  }
}
