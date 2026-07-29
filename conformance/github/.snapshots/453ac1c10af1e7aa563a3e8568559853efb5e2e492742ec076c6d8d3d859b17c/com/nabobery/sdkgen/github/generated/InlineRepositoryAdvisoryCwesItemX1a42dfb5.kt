package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/cwes/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/cwes/items
 */
@Serializable(with = InlineRepositoryAdvisoryCwesItemX1a42dfb5.Serializer::class)
public class InlineRepositoryAdvisoryCwesItemX1a42dfb5(
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

    public fun build(): InlineRepositoryAdvisoryCwesItemX1a42dfb5 {
      check(cweIdValue != null) { "cweId is required" }
      check(nameValue != null) { "name is required" }
      return InlineRepositoryAdvisoryCwesItemX1a42dfb5(
        cweId = cweId,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryCwesItemX1a42dfb5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryAdvisoryCwesItemX1a42dfb5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryCwesItemX1a42dfb5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryCwesItemX1a42dfb5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryCwesItemX1a42dfb5 must be a JSON object")
      val cweId = json.decodeRequired<String>(rawObject, "cwe_id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineRepositoryAdvisoryCwesItemX1a42dfb5(
        cweId = cweId,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryCwesItemX1a42dfb5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryCwesItemX1a42dfb5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cwe_id", value.cweId)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryCwesItemX1a42dfb5(block: InlineRepositoryAdvisoryCwesItemX1a42dfb5.Builder.() -> Unit): InlineRepositoryAdvisoryCwesItemX1a42dfb5 = InlineRepositoryAdvisoryCwesItemX1a42dfb5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisoryCwesItemX1a42dfb5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
