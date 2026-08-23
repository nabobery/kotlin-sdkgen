package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Indicates the alert type of a campaign
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/campaign-alert-type
 */
@Serializable(with = CampaignAlertType.Serializer::class)
public sealed class CampaignAlertType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_scanning`.
   */
  public data object CodeScanning : CampaignAlertType() {
    public override val `value`: String = "code_scanning"
  }

  /**
   * Documented value. Wire value: `secret_scanning`.
   */
  public data object SecretScanning : CampaignAlertType() {
    public override val `value`: String = "secret_scanning"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CampaignAlertType()

  public companion object {
    public fun fromValue(`value`: String): CampaignAlertType = when (value) {
      CodeScanning.value -> CodeScanning
      SecretScanning.value -> SecretScanning
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CampaignAlertType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.CampaignAlertType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CampaignAlertType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CampaignAlertType) {
      encoder.encodeString(value.value)
    }
  }
}
