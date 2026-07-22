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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Permission check result for a given devcontainer config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespaces-permissions-check-for-devcontainer
 */
@Serializable(with = CodespacesPermissionsCheckForDevcontainer.Serializer::class)
public class CodespacesPermissionsCheckForDevcontainer(
  /**
   * Whether the user has accepted the permissions defined by the devcontainer config
   */
  public val accepted: Boolean,
) {
  public class Builder {
    private var acceptedValue: Boolean? = null

    public var accepted: Boolean
      get() = requireNotNull(acceptedValue) { "accepted is required" }
      set(`value`) {
        acceptedValue = value
      }

    public fun build(): CodespacesPermissionsCheckForDevcontainer {
      check(acceptedValue != null) { "accepted is required" }
      return CodespacesPermissionsCheckForDevcontainer(
        accepted = accepted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodespacesPermissionsCheckForDevcontainer = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodespacesPermissionsCheckForDevcontainer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodespacesPermissionsCheckForDevcontainer {
      val jsonDecoder = decoder.requireJsonDecoder("CodespacesPermissionsCheckForDevcontainer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodespacesPermissionsCheckForDevcontainer must be a JSON object")
      val accepted = json.decodeRequired<Boolean>(rawObject, "accepted")
      return CodespacesPermissionsCheckForDevcontainer(
        accepted = accepted,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodespacesPermissionsCheckForDevcontainer) {
      val jsonEncoder = encoder.requireJsonEncoder("CodespacesPermissionsCheckForDevcontainer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("accepted", json.encodeToJsonElement(value.accepted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codespacesPermissionsCheckForDevcontainer(block: CodespacesPermissionsCheckForDevcontainer.Builder.() -> Unit): CodespacesPermissionsCheckForDevcontainer = CodespacesPermissionsCheckForDevcontainer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodespacesPermissionsCheckForDevcontainer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
