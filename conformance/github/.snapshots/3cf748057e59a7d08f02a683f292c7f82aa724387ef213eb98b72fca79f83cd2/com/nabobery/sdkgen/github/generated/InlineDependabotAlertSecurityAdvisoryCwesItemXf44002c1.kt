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
 * A CWE weakness assigned to the advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-security-advisory/properties/cwes/items
 */
@Serializable(with = InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1.Serializer::class)
public class InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1(
  /**
   * The unique CWE ID.
   */
  public val cweId: String,
  /**
   * The short, plain text name of the CWE.
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

    public fun build(): InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1 {
      check(cweIdValue != null) { "cweId is required" }
      check(nameValue != null) { "name is required" }
      return InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1(
        cweId = cweId,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1 must be a JSON object")
      val cweId = json.decodeRequired<String>(rawObject, "cwe_id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1(
        cweId = cweId,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cwe_id", value.cweId)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1(block: InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1.Builder.() -> Unit): InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1 = InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependabotAlertSecurityAdvisoryCwesItemXf44002c1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
