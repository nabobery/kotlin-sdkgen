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
 * The source of the runner image.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners/post/requestBody/content/application~1json
 * /schema/properties/image/properties/source
 */
@Serializable(with = InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362.Serializer::class)
public sealed class InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362() {
    public override val `value`: String = "github"
  }

  /**
   * Documented value. Wire value: `partner`.
   */
  public data object Partner : InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362() {
    public override val `value`: String = "partner"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362 = when (value) {
      Github.value -> Github
      Partner.value -> Partner
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362) {
      encoder.encodeString(value.value)
    }
  }
}
