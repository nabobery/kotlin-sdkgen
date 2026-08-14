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
 * The image provider.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner-curated-image/properties/source
 */
@Serializable(with = InlineActionsHostedRunnerCuratedImageSourceXf0f99184.Serializer::class)
public sealed class InlineActionsHostedRunnerCuratedImageSourceXf0f99184 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineActionsHostedRunnerCuratedImageSourceXf0f99184() {
    public override val `value`: String = "github"
  }

  /**
   * Documented value. Wire value: `partner`.
   */
  public data object Partner : InlineActionsHostedRunnerCuratedImageSourceXf0f99184() {
    public override val `value`: String = "partner"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineActionsHostedRunnerCuratedImageSourceXf0f99184() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineActionsHostedRunnerCuratedImageSourceXf0f99184()

  public companion object {
    public fun fromValue(`value`: String): InlineActionsHostedRunnerCuratedImageSourceXf0f99184 = when (value) {
      Github.value -> Github
      Partner.value -> Partner
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineActionsHostedRunnerCuratedImageSourceXf0f99184> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineActionsHostedRunnerCuratedImageSourceXf0f99184", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineActionsHostedRunnerCuratedImageSourceXf0f99184 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineActionsHostedRunnerCuratedImageSourceXf0f99184) {
      encoder.encodeString(value.value)
    }
  }
}
