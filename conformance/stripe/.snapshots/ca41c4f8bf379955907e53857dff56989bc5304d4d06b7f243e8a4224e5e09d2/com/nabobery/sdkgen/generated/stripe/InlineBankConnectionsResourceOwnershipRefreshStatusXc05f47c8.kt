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
 * The status of the last refresh attempt.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_ownership_refresh/properties/status
 */
@Serializable(with = InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8.Serializer::class)
public sealed class InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8()

  public companion object {
    public fun fromValue(`value`: String): InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8 = when (value) {
      Failed.value -> Failed
      Pending.value -> Pending
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResourceOwnershipRefreshStatusXc05f47c8) {
      encoder.encodeString(value.value)
    }
  }
}
