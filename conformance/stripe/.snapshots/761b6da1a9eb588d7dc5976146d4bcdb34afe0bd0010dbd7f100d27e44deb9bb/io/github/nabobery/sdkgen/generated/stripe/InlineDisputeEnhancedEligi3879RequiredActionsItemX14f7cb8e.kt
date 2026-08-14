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
 * sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility_visa_compelling_evidence3/properties/re
 * quired_actions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility_visa_compelling_evidence3/properties/re
 * quired_actions/items
 */
@Serializable(with = InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e.Serializer::class)
public sealed class InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing_customer_identifiers`.
   */
  public data object MissingCustomerIdentifiers : InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e() {
    public override val `value`: String = "missing_customer_identifiers"
  }

  /**
   * Documented value. Wire value: `missing_disputed_transaction_description`.
   */
  public data object MissingDisputedTransactionDescription : InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e() {
    public override val `value`: String = "missing_disputed_transaction_description"
  }

  /**
   * Documented value. Wire value: `missing_merchandise_or_services`.
   */
  public data object MissingMerchandiseOrServices : InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e() {
    public override val `value`: String = "missing_merchandise_or_services"
  }

  /**
   * Documented value. Wire value: `missing_prior_undisputed_transaction_description`.
   */
  public data object MissingPriorUndisputedTransactionDescription : InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e() {
    public override val `value`: String = "missing_prior_undisputed_transaction_description"
  }

  /**
   * Documented value. Wire value: `missing_prior_undisputed_transactions`.
   */
  public data object MissingPriorUndisputedTransactions : InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e() {
    public override val `value`: String = "missing_prior_undisputed_transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e = when (value) {
      MissingCustomerIdentifiers.value -> MissingCustomerIdentifiers
      MissingDisputedTransactionDescription.value -> MissingDisputedTransactionDescription
      MissingMerchandiseOrServices.value -> MissingMerchandiseOrServices
      MissingPriorUndisputedTransactionDescription.value -> MissingPriorUndisputedTransactionDescription
      MissingPriorUndisputedTransactions.value -> MissingPriorUndisputedTransactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEnhancedEligi3879RequiredActionsItemX14f7cb8e) {
      encoder.encodeString(value.value)
    }
  }
}
