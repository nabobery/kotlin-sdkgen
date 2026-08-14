package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/cwes/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/cwes/items
 */
@Serializable(with = InlineGlobalAdvisoryCwesItemX1a9e04b8.Serializer::class)
public class InlineGlobalAdvisoryCwesItemX1a9e04b8(
  /**
   * The Common Weakness Enumeration (CWE) identifier.
   */
  public val cweId: String,
  /**
   * The name of the CWE.
   */
  public val name: String,
) {
  public class Builder {
    private var cweIdValue: String? = null

    public var cweId: String
      get() = requireNotNull(cweIdValue) { "cweId is required" }
      set(`value`) {
        cweIdValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineGlobalAdvisoryCwesItemX1a9e04b8 {
      check(cweIdValue != null) { "cweId is required" }
      check(nameValue != null) { "name is required" }
      return InlineGlobalAdvisoryCwesItemX1a9e04b8(
        cweId = cweId,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGlobalAdvisoryCwesItemX1a9e04b8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGlobalAdvisoryCwesItemX1a9e04b8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGlobalAdvisoryCwesItemX1a9e04b8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGlobalAdvisoryCwesItemX1a9e04b8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGlobalAdvisoryCwesItemX1a9e04b8 must be a JSON object")
      val cweId = json.decodeRequired<String>(rawObject, "cwe_id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineGlobalAdvisoryCwesItemX1a9e04b8(
        cweId = cweId,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGlobalAdvisoryCwesItemX1a9e04b8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGlobalAdvisoryCwesItemX1a9e04b8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cwe_id", value.cweId)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGlobalAdvisoryCwesItemX1a9e04b8(block: InlineGlobalAdvisoryCwesItemX1a9e04b8.Builder.() -> Unit): InlineGlobalAdvisoryCwesItemX1a9e04b8 = InlineGlobalAdvisoryCwesItemX1a9e04b8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGlobalAdvisoryCwesItemX1a9e04b8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
