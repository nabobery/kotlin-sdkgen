package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/VideoModel/properties/supported_aspect_ratios/items.
 */
@Serializable(with = InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems.Serializer::class)
public sealed class InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `16:9`.
   */
  public data object _169 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "16:9"
  }

  /**
   * Documented value. Wire value: `9:16`.
   */
  public data object _916 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "9:16"
  }

  /**
   * Documented value. Wire value: `1:1`.
   */
  public data object _11 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "1:1"
  }

  /**
   * Documented value. Wire value: `4:3`.
   */
  public data object _43 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "4:3"
  }

  /**
   * Documented value. Wire value: `3:4`.
   */
  public data object _34 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "3:4"
  }

  /**
   * Documented value. Wire value: `3:2`.
   */
  public data object _32 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "3:2"
  }

  /**
   * Documented value. Wire value: `2:3`.
   */
  public data object _23 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "2:3"
  }

  /**
   * Documented value. Wire value: `21:9`.
   */
  public data object _219 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "21:9"
  }

  /**
   * Documented value. Wire value: `9:21`.
   */
  public data object _921 : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems() {
    public override val `value`: String = "9:21"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems =
      when (value) {
      _169.value -> _169
      _916.value -> _916
      _11.value -> _11
      _43.value -> _43
      _34.value -> _34
      _32.value -> _32
      _23.value -> _23
      _219.value -> _219
      _921.value -> _921
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasVideoModelPropertiesSupportedAspectRatiosItems) {
      encoder.encodeString(value.value)
    }
  }
}
