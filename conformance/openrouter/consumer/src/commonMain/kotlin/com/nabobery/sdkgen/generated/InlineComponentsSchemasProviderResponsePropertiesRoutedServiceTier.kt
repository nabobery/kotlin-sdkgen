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
 * The service tier this request was routed to (e.g. flex, priority). The tier actually applied and billed is determined
 * by the provider response and may differ.
 */
@Serializable(with = InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier.Serializer::class)
public sealed class InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `flex`.
   */
  public data object Flex : InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier() {
    public override val `value`: String = "flex"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier() {
    public override val `value`: String = "priority"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier =
      when (value) {
      Flex.value -> Flex
      Priority.value -> Priority
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasProviderResponsePropertiesRoutedServiceTier) {
      encoder.encodeString(value.value)
    }
  }
}
