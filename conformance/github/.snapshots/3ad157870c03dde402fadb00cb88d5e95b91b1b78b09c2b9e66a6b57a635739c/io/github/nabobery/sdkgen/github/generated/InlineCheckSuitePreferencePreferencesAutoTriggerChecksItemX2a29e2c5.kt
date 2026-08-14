package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/check-suite-preference/properties/preferences/properties/auto_trigge
 * r_checks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/check-suite-preference/properties/preferences/properties/auto_trigge
 * r_checks/items
 */
@Serializable(with = InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5.Serializer::class)
public class InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5(
  public val appId: Int,
  public val setting: Boolean,
) {
  public class Builder {
    private var appIdValue: Int? = null

    public var appId: Int
      get() = requireNotNull(appIdValue) { "appId is required" }
      set(`value`) {
        appIdValue = value
      }

    private var settingValue: Boolean? = null

    public var setting: Boolean
      get() = requireNotNull(settingValue) { "setting is required" }
      set(`value`) {
        settingValue = value
      }

    public fun build(): InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5 {
      check(appIdValue != null) { "appId is required" }
      check(settingValue != null) { "setting is required" }
      return InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5(
        appId = appId,
        setting = setting,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5 must be a JSON object")
      val appId = json.decodeRequired<Int>(rawObject, "app_id")
      val setting = json.decodeRequired<Boolean>(rawObject, "setting")
      return InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5(
        appId = appId,
        setting = setting,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app_id", json.encodeToJsonElement(value.appId))
        put("setting", json.encodeToJsonElement(value.setting))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5(block: InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5.Builder.() -> Unit): InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5 = InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCheckSuitePreferencePreferencesAutoTriggerChecksItemX2a29e2c5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
