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
 * The image provider.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-actions-hosted-runner-pool-image/properties/source
 */
@Serializable(with = InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69.Serializer::class)
public sealed class InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69() {
    public override val `value`: String = "github"
  }

  /**
   * Documented value. Wire value: `partner`.
   */
  public data object Partner : InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69() {
    public override val `value`: String = "partner"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69 = when (value) {
      Github.value -> Github
      Partner.value -> Partner
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69) {
      encoder.encodeString(value.value)
    }
  }
}
