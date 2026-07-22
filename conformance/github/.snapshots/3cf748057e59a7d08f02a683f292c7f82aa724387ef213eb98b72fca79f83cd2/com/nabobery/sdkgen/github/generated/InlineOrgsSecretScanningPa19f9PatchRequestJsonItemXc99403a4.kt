package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/requestBody/content/
 * application~1json/schema/properties/provider_pattern_settings/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/requestBody/content/
 * application~1json/schema/properties/provider_pattern_settings/items
 */
@Serializable(with = InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4.Serializer::class)
public class InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4 internal constructor(
  private val pushProtectionSettingState:
      FieldState<InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingXe9e12683>,
  private val tokenTypeState: FieldState<String>,
) {
  /**
   * Push protection setting to set for the pattern.
   */
  public val pushProtectionSetting:
      InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingXe9e12683?
    get() = pushProtectionSettingState.valueOrNull()

  /**
   * The ID of the pattern to configure.
   */
  public val tokenType: String?
    get() = tokenTypeState.valueOrNull()

  public constructor() : this(pushProtectionSettingState = FieldState.Absent,
  tokenTypeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `push_protection_setting`.
   */
  public fun pushProtectionSettingPresence(): FieldPresence = pushProtectionSettingState.presence

  /**
   * Returns the wire presence of `token_type`.
   */
  public fun tokenTypePresence(): FieldPresence = tokenTypeState.presence

  public class Builder {
    private var pushProtectionSettingState:
        FieldState<InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingXe9e12683> =
        FieldState.Absent

    /**
     * Push protection setting to set for the pattern.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pushProtectionSetting:
        InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingXe9e12683?
      get() = pushProtectionSettingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pushProtectionSetting is not nullable; call unsetPushProtectionSetting() to omit it" }
        pushProtectionSettingState = FieldState.Value(present)
      }

    private var tokenTypeState: FieldState<String> = FieldState.Absent

    /**
     * The ID of the pattern to configure.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tokenType: String?
      get() = tokenTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tokenType is not nullable; call unsetTokenType() to omit it" }
        tokenTypeState = FieldState.Value(present)
      }

    /**
     * Omits `push_protection_setting` from serialized output.
     */
    public fun unsetPushProtectionSetting() {
      pushProtectionSettingState = FieldState.Absent
    }

    /**
     * Omits `token_type` from serialized output.
     */
    public fun unsetTokenType() {
      tokenTypeState = FieldState.Absent
    }

    public fun build(): InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4 = InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4(
      pushProtectionSettingState = pushProtectionSettingState,
      tokenTypeState = tokenTypeState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4 must be a JSON object")
      return InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4(
        pushProtectionSettingState = json.decodeOptional(rawObject, "push_protection_setting", nullable = false),
        tokenTypeState = json.decodeOptional(rawObject, "token_type", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("push_protection_setting", value.pushProtectionSettingState, json::encodeToJsonElement)
        putState("token_type", value.tokenTypeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4(block: InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4.Builder.() -> Unit): InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4 = InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4 property '" + name + "' is not nullable")
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
