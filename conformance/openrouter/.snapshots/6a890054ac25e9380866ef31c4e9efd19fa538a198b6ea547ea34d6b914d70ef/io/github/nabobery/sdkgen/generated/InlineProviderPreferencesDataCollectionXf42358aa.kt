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
 * Data collection setting. If no available model provider meets the requirement, your request will return an error.
 * - allow: (default) allow providers which store user data non-transiently and may train on it
 *
 * - deny: use only providers which do not collect user data.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/data_collection
 */
@Serializable(with = InlineProviderPreferencesDataCollectionXf42358aa.Serializer::class)
public sealed class InlineProviderPreferencesDataCollectionXf42358aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deny`.
   */
  public data object Deny : InlineProviderPreferencesDataCollectionXf42358aa() {
    public override val `value`: String = "deny"
  }

  /**
   * Documented value. Wire value: `allow`.
   */
  public data object Allow : InlineProviderPreferencesDataCollectionXf42358aa() {
    public override val `value`: String = "allow"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProviderPreferencesDataCollectionXf42358aa()

  public companion object {
    public fun fromValue(`value`: String): InlineProviderPreferencesDataCollectionXf42358aa = when (value) {
      Deny.value -> Deny
      Allow.value -> Allow
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineProviderPreferencesDataCollectionXf42358aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineProviderPreferencesDataCollectionXf42358aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProviderPreferencesDataCollectionXf42358aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProviderPreferencesDataCollectionXf42358aa) {
      encoder.encodeString(value.value)
    }
  }
}
