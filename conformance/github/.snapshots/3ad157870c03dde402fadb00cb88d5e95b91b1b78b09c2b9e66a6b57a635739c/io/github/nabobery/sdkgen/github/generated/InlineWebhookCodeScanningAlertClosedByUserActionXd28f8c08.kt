package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/action
 */
@Serializable(with = InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed_by_user`.
   */
  public data object ClosedByUser : InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08() {
    public override val `value`: String = "closed_by_user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08 = when (value) {
      ClosedByUser.value -> ClosedByUser
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertClosedByUserActionXd28f8c08) {
      encoder.encodeString(value.value)
    }
  }
}
