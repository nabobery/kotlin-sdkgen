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
 * State of the release asset.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/release-asset/properties/state
 */
@Serializable(with = InlineReleaseAssetStateXa6acf425.Serializer::class)
public sealed class InlineReleaseAssetStateXa6acf425 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `uploaded`.
   */
  public data object Uploaded : InlineReleaseAssetStateXa6acf425() {
    public override val `value`: String = "uploaded"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReleaseAssetStateXa6acf425() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReleaseAssetStateXa6acf425()

  public companion object {
    public fun fromValue(`value`: String): InlineReleaseAssetStateXa6acf425 = when (value) {
      Uploaded.value -> Uploaded
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReleaseAssetStateXa6acf425> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReleaseAssetStateXa6acf425", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReleaseAssetStateXa6acf425 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReleaseAssetStateXa6acf425) {
      encoder.encodeString(value.value)
    }
  }
}
