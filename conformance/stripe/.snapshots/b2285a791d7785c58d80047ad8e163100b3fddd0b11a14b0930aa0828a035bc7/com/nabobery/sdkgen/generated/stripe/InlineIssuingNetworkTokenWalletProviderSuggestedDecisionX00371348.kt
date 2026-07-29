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
 * The recommendation on responding to the tokenization request.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_network_token_wallet_provider/properties/suggested_decision
 */
@Serializable(with = InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348.Serializer::class)
public sealed class InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approve`.
   */
  public data object Approve : InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348() {
    public override val `value`: String = "approve"
  }

  /**
   * Documented value. Wire value: `decline`.
   */
  public data object Decline : InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348() {
    public override val `value`: String = "decline"
  }

  /**
   * Documented value. Wire value: `require_auth`.
   */
  public data object RequireAuth : InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348() {
    public override val `value`: String = "require_auth"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348 = when (value) {
      Approve.value -> Approve
      Decline.value -> Decline
      RequireAuth.value -> RequireAuth
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingNetworkTokenWalletProviderSuggestedDecisionX00371348) {
      encoder.encodeString(value.value)
    }
  }
}
