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
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_number_details/properties/supporte
 * d_networks/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_number_details/properties/supporte
 * d_networks/items
 */
@Serializable(with = InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c.Serializer::class)
public sealed class InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c() {
    public override val `value`: String = "ach"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c()

  public companion object {
    public fun fromValue(`value`: String): InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c = when (value) {
      Ach.value -> Ach
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c) {
      encoder.encodeString(value.value)
    }
  }
}
