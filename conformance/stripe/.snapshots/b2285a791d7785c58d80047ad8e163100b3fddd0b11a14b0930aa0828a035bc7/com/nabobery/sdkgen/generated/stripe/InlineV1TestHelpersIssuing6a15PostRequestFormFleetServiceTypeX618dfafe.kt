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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet/properties/service_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet/properties/service_type
 */
@Serializable(with = InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe.Serializer::class)
public sealed class InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `full_service`.
   */
  public data object FullService : InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe() {
    public override val `value`: String = "full_service"
  }

  /**
   * Documented value. Wire value: `non_fuel_transaction`.
   */
  public data object NonFuelTransaction : InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe() {
    public override val `value`: String = "non_fuel_transaction"
  }

  /**
   * Documented value. Wire value: `self_service`.
   */
  public data object SelfService : InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe() {
    public override val `value`: String = "self_service"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe = when (value) {
      FullService.value -> FullService
      NonFuelTransaction.value -> NonFuelTransaction
      SelfService.value -> SelfService
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe) {
      encoder.encodeString(value.value)
    }
  }
}
