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
 * Type of limit reset for the API key (daily, weekly, monthly, or null for no reset). Resets happen automatically at
 * midnight UTC, and weeks are Monday through Sunday.
 */
@Serializable(with = InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset.Serializer::class)
public sealed class InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset() {
    public override val `value`: String = "monthly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset = when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset) {
      encoder.encodeString(value.value)
    }
  }
}
