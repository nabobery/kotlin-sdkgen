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
 * Data collection setting. If no available model provider meets the requirement, your request will return an error.
 * - allow: (default) allow providers which store user data non-transiently and may train on it
 *
 * - deny: use only providers which do not collect user data.
 */
@Serializable(with = InlineComponentsSchemasProviderPreferencesPropertiesDataCollection.Serializer::class)
public sealed class InlineComponentsSchemasProviderPreferencesPropertiesDataCollection {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deny`.
   */
  public data object Deny : InlineComponentsSchemasProviderPreferencesPropertiesDataCollection() {
    public override val `value`: String = "deny"
  }

  /**
   * Documented value. Wire value: `allow`.
   */
  public data object Allow : InlineComponentsSchemasProviderPreferencesPropertiesDataCollection() {
    public override val `value`: String = "allow"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasProviderPreferencesPropertiesDataCollection()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasProviderPreferencesPropertiesDataCollection =
      when (value) {
      Deny.value -> Deny
      Allow.value -> Allow
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasProviderPreferencesPropertiesDataCollection> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasProviderPreferencesPropertiesDataCollection", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasProviderPreferencesPropertiesDataCollection =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasProviderPreferencesPropertiesDataCollection) {
      encoder.encodeString(value.value)
    }
  }
}
