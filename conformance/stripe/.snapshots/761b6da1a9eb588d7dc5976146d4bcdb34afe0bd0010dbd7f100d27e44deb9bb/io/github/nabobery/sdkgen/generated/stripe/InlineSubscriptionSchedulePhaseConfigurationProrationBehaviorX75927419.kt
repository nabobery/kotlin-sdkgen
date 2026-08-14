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
 * When transitioning phases, controls how prorations are handled (if any). Possible values are `create_prorations`,
 * `none`, and `always_invoice`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration/properties/proration_behav
 * ior
 */
@Serializable(with = InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419.Serializer::class)
public sealed class InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always_invoice`.
   */
  public data object AlwaysInvoice : InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419() {
    public override val `value`: String = "always_invoice"
  }

  /**
   * Documented value. Wire value: `create_prorations`.
   */
  public data object CreateProrations : InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419() {
    public override val `value`: String = "create_prorations"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419 = when (value) {
      AlwaysInvoice.value -> AlwaysInvoice
      CreateProrations.value -> CreateProrations
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419) {
      encoder.encodeString(value.value)
    }
  }
}
