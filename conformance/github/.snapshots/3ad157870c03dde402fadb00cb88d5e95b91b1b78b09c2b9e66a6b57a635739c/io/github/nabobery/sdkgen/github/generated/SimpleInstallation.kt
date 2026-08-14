package io.github.nabobery.sdkgen.github.generated

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
 * The GitHub App installation. Webhook payloads contain the `installation` property when the event is configured
 * for and sent to a GitHub App. For more information,
 * see "[Using webhooks with GitHub
 * Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-installation
 */
@Serializable(with = SimpleInstallation.Serializer::class)
public class SimpleInstallation(
  /**
   * The ID of the installation.
   */
  public val id: Int,
  /**
   * The global node ID of the installation.
   */
  public val nodeId: String,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    public fun build(): SimpleInstallation {
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      return SimpleInstallation(
        id = id,
        nodeId = nodeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SimpleInstallation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SimpleInstallation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SimpleInstallation {
      val jsonDecoder = decoder.requireJsonDecoder("SimpleInstallation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SimpleInstallation must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      return SimpleInstallation(
        id = id,
        nodeId = nodeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SimpleInstallation) {
      val jsonEncoder = encoder.requireJsonEncoder("SimpleInstallation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun simpleInstallation(block: SimpleInstallation.Builder.() -> Unit): SimpleInstallation = SimpleInstallation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SimpleInstallation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
