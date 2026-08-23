package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1access/put/requestBody/content/application~1json/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1access/put/requestBody/content/application~1json/schem
 * a
 */
@Serializable(with = InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63.Serializer::class)
public class InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63(
  /**
   * Which users can access codespaces in the organization. `disabled` means that no users can access codespaces in the
   * organization.
   */
  public val visibility: InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed,
  selectedUsernames: List<String>? = null,
) {
  /**
   * The usernames of the organization members who should have access to codespaces in the organization. Required when
   * `visibility` is `selected_members`. The provided list of usernames will replace any existing value.
   */
  public val selectedUsernames: List<String>? =
      selectedUsernames?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var visibilityValue: InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed? = null

    public var visibility: InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    private var selectedUsernamesValue: List<String>? = null

    /**
     * The usernames of the organization members who should have access to codespaces in the organization. Required when
     * `visibility` is `selected_members`. The provided list of usernames will replace any existing value.
     */
    public var selectedUsernames: List<String>?
      get() = selectedUsernamesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedUsernamesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63 {
      check(visibilityValue != null) { "visibility is required" }
      return InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63(
        visibility = visibility,
        selectedUsernames = selectedUsernames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63 must be a JSON object")
      val visibility = json.decodeRequired<InlineOrgsCodespacesAccessPutRequestJsonVisibilityX0cce40ed>(rawObject, "visibility")
      return InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63(
        visibility = visibility,
        selectedUsernames = rawObject["selected_usernames"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.selectedUsernames?.let { put("selected_usernames", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63(block: InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63.Builder.() -> Unit): InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63 = InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
