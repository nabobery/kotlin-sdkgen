package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/check-suite-preference/properties/preferences.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-suite-preference/properties/preferences
 */
@Serializable(with = InlineCheckSuitePreferencePreferencesX4fcefa9d.Serializer::class)
public class InlineCheckSuitePreferencePreferencesX4fcefa9d(
  autoTriggerChecks: List<InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5>? = null,
) {
  public val autoTriggerChecks:
      List<InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5>? =
      autoTriggerChecks?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var autoTriggerChecksValue:
        List<InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5>? = null

    public var autoTriggerChecks:
        List<InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5>?
      get() = autoTriggerChecksValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        autoTriggerChecksValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineCheckSuitePreferencePreferencesX4fcefa9d = InlineCheckSuitePreferencePreferencesX4fcefa9d(
      autoTriggerChecks = autoTriggerChecks,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCheckSuitePreferencePreferencesX4fcefa9d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCheckSuitePreferencePreferencesX4fcefa9d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckSuitePreferencePreferencesX4fcefa9d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckSuitePreferencePreferencesX4fcefa9d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCheckSuitePreferencePreferencesX4fcefa9d must be a JSON object")
      return InlineCheckSuitePreferencePreferencesX4fcefa9d(
        autoTriggerChecks = rawObject["auto_trigger_checks"]?.let { json.decodeFromJsonElement<List<InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckSuitePreferencePreferencesX4fcefa9d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCheckSuitePreferencePreferencesX4fcefa9d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.autoTriggerChecks?.let { put("auto_trigger_checks", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCheckSuitePreferencePreferencesX4fcefa9d(block: InlineCheckSuitePreferencePreferencesX4fcefa9d.Builder.() -> Unit): InlineCheckSuitePreferencePreferencesX4fcefa9d = InlineCheckSuitePreferencePreferencesX4fcefa9d.build(block)
