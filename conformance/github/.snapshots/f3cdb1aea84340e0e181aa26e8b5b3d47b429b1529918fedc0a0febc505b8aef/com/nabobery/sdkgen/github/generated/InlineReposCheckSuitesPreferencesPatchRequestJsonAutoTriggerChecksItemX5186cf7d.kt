package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites~1preferences/patch/requestBody/content/app
 * lication~1json/schema/properties/auto_trigger_checks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites~1preferences/patch/requestBody/content/app
 * lication~1json/schema/properties/auto_trigger_checks/items
 */
@Serializable(with = InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d.Serializer::class)
public class InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d(
  /**
   * The `id` of the GitHub App.
   */
  public val appId: Int,
  /**
   * Set to `true` to enable automatic creation of CheckSuite events upon pushes to the repository, or `false` to
   * disable them.
   */
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

    public fun build(): InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d {
      check(appIdValue != null) { "appId is required" }
      check(settingValue != null) { "setting is required" }
      return InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d(
        appId = appId,
        setting = setting,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d must be a JSON object")
      val appId = json.decodeRequired<Int>(rawObject, "app_id")
      val setting = json.decodeRequired<Boolean>(rawObject, "setting")
      return InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d(
        appId = appId,
        setting = setting,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app_id", json.encodeToJsonElement(value.appId))
        put("setting", json.encodeToJsonElement(value.setting))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d(block: InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d.Builder.() -> Unit): InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d = InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposCheckSuitesPreferencesPatchRequestJsonAutoTriggerChecksItemX5186cf7d property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
