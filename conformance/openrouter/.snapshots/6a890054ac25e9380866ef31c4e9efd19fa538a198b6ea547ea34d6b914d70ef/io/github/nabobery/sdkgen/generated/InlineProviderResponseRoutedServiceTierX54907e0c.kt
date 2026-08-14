package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderResponse/properties/routed_service_tier
 */
@Serializable(with = InlineProviderResponseRoutedServiceTierX54907e0c.Serializer::class)
public sealed class InlineProviderResponseRoutedServiceTierX54907e0c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `flex`.
   */
  public data object Flex : InlineProviderResponseRoutedServiceTierX54907e0c() {
    public override val `value`: String = "flex"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : InlineProviderResponseRoutedServiceTierX54907e0c() {
    public override val `value`: String = "priority"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProviderResponseRoutedServiceTierX54907e0c()

  public companion object {
    public fun fromValue(`value`: String): InlineProviderResponseRoutedServiceTierX54907e0c = when (value) {
      Flex.value -> Flex
      Priority.value -> Priority
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineProviderResponseRoutedServiceTierX54907e0c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineProviderResponseRoutedServiceTierX54907e0c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProviderResponseRoutedServiceTierX54907e0c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProviderResponseRoutedServiceTierX54907e0c) {
      encoder.encodeString(value.value)
    }
  }
}
