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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/tool.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/tool
 */
@Serializable(with = InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76.Serializer::class)
public class InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76(
  /**
   * The name of the tool used to generate the code scanning analysis alert.
   */
  public val name: String,
  /**
   * The version of the tool used to detect the alert.
   */
  public val version: String?,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var versionState: FieldState<String?> = FieldState.Absent

    /**
     * The version of the tool used to detect the alert.
     * Required nullable field; assigning `null` records present-null.
     */
    public var version: String?
      get() = versionState.valueOrNull()
      set(`value`) {
        versionState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76 {
      check(nameValue != null) { "name is required" }
      check(versionState !== FieldState.Absent) { "version is required, even when null" }
      return InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76(
        name = name,
        version = versionState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      if (!rawObject.containsKey("version")) {
        throw SerializationException("InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76 is missing required property 'version'")
      }
      val version = rawObject["version"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76(
        name = name,
        version = version,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("version", value.version?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76(block: InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76.Builder.() -> Unit): InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76 = InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookCodeScanningAlertAppearedInBranchAlertToolX9bc2fb76 property '" + name + "' is not nullable")
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
