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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/models.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions/properties/models
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831.Serializer::class)
public sealed class InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831) {
      encoder.encodeString(value.value)
    }
  }
}
