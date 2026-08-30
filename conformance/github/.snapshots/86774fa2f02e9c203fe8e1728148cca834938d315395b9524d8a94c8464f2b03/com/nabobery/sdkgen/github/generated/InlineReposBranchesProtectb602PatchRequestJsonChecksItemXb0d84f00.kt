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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_status_checks/
 * patch/requestBody/content/application~1json/schema/properties/checks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_status_checks/
 * patch/requestBody/content/application~1json/schema/properties/checks/items
 */
@Serializable(with = InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00.Serializer::class)
public class InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00 internal constructor(
  /**
   * The name of the required check
   */
  public val context: String,
  private val appIdState: FieldState<Int>,
) {
  /**
   * The ID of the GitHub App that must provide this check. Omit this field to automatically select the GitHub App that
   * has recently provided this check, or any app if it was not set by a GitHub App. Pass -1 to explicitly allow any app
   * to set the status.
   */
  public val appId: Int?
    get() = appIdState.valueOrNull()

  public constructor(context: String) : this(context = context,
  appIdState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `app_id`.
   */
  public fun appIdPresence(): FieldPresence = appIdState.presence

  public class Builder {
    private var contextValue: String? = null

    public var context: String
      get() = requireNotNull(contextValue) { "context is required" }
      set(`value`) {
        contextValue = value
      }

    private var appIdState: FieldState<Int> = FieldState.Absent

    /**
     * The ID of the GitHub App that must provide this check. Omit this field to automatically select the GitHub App
     * that has recently provided this check, or any app if it was not set by a GitHub App. Pass -1 to explicitly allow
     * any app to set the status.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var appId: Int?
      get() = appIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "appId is not nullable; call unsetAppId() to omit it" }
        appIdState = FieldState.Value(present)
      }

    /**
     * Omits `app_id` from serialized output.
     */
    public fun unsetAppId() {
      appIdState = FieldState.Absent
    }

    public fun build(): InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00 {
      check(contextValue != null) { "context is required" }
      return InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00(
        context = context,
        appIdState = appIdState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00 must be a JSON object")
      val context = json.decodeRequired<String>(rawObject, "context")
      return InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00(
        context = context,
        appIdState = json.decodeOptional(rawObject, "app_id", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("context", value.context)
        putState("app_id", value.appIdState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00(block: InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00.Builder.() -> Unit): InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00 = InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00 property '" + name + "' is not nullable")
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
