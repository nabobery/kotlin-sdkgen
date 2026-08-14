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
 * Represents what the user should do, if anything, to activate the Feature.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_toggles_setting_status_details/
 * properties/resolution
 */
@Serializable(with = InlineTreasuryFinancialAccee56ResolutionX94fe9ba9.Serializer::class)
public sealed class InlineTreasuryFinancialAccee56ResolutionX94fe9ba9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `contact_stripe`.
   */
  public data object ContactStripe : InlineTreasuryFinancialAccee56ResolutionX94fe9ba9() {
    public override val `value`: String = "contact_stripe"
  }

  /**
   * Documented value. Wire value: `provide_information`.
   */
  public data object ProvideInformation : InlineTreasuryFinancialAccee56ResolutionX94fe9ba9() {
    public override val `value`: String = "provide_information"
  }

  /**
   * Documented value. Wire value: `remove_restriction`.
   */
  public data object RemoveRestriction : InlineTreasuryFinancialAccee56ResolutionX94fe9ba9() {
    public override val `value`: String = "remove_restriction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccee56ResolutionX94fe9ba9()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccee56ResolutionX94fe9ba9 = when (value) {
      ContactStripe.value -> ContactStripe
      ProvideInformation.value -> ProvideInformation
      RemoveRestriction.value -> RemoveRestriction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccee56ResolutionX94fe9ba9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccee56ResolutionX94fe9ba9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccee56ResolutionX94fe9ba9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccee56ResolutionX94fe9ba9) {
      encoder.encodeString(value.value)
    }
  }
}
