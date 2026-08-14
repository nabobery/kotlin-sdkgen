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
 * The source type of the runner image to use. Must match the source of the image specified by `image_id`. Can be one of
 * `github`, `partner`, or `custom`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1{hosted_runner_id}/patch/requestBody/cont
 * ent/application~1json/schema/properties/image_source
 */
@Serializable(with = InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4.Serializer::class)
public sealed class InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4() {
    public override val `value`: String = "github"
  }

  /**
   * Documented value. Wire value: `partner`.
   */
  public data object Partner : InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4() {
    public override val `value`: String = "partner"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4 = when (value) {
      Github.value -> Github
      Partner.value -> Partner
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4) {
      encoder.encodeString(value.value)
    }
  }
}
