package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/usage
 */
@Serializable(with = InlineV1SourcesPostRequestFormUsageXb0573f22.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormUsageXb0573f22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reusable`.
   */
  public data object Reusable : InlineV1SourcesPostRequestFormUsageXb0573f22() {
    public override val `value`: String = "reusable"
  }

  /**
   * Documented value. Wire value: `single_use`.
   */
  public data object SingleUse : InlineV1SourcesPostRequestFormUsageXb0573f22() {
    public override val `value`: String = "single_use"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SourcesPostRequestFormUsageXb0573f22()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormUsageXb0573f22 = when (value) {
      Reusable.value -> Reusable
      SingleUse.value -> SingleUse
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormUsageXb0573f22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormUsageXb0573f22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormUsageXb0573f22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormUsageXb0573f22) {
      encoder.encodeString(value.value)
    }
  }
}
