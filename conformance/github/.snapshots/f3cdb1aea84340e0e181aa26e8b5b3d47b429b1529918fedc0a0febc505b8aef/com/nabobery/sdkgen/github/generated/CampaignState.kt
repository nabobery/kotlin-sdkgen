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
 * Indicates whether a campaign is open or closed
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/campaign-state
 */
@Serializable(with = CampaignState.Serializer::class)
public sealed class CampaignState {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : CampaignState() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : CampaignState() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CampaignState()

  public companion object {
    public fun fromValue(`value`: String): CampaignState = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CampaignState> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.CampaignState", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CampaignState = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CampaignState) {
      encoder.encodeString(value.value)
    }
  }
}
