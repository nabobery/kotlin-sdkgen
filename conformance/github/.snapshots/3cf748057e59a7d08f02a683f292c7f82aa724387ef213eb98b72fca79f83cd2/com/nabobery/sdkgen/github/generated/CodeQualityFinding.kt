package com.nabobery.sdkgen.github.generated

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
 * Code quality finding
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-finding
 */
@Serializable(with = CodeQualityFinding.Serializer::class)
public class CodeQualityFinding(
  public val location: CodeQualityFindingLocation,
  public val message: CodeQualityFindingMessage,
  /**
   * The finding number.
   */
  public val number: Int,
  public val rule: CodeQualityFindingRule,
  /**
   * State of the code quality finding.
   */
  public val state: InlineCodeQualityFindingStateXbc1d5a53,
  /**
   * The REST API URL of the code quality finding resource.
   */
  public val url: String,
  /**
   * The time the code quality finding was created.
   */
  public val createdAt: String? = null,
) {
  public class Builder {
    private var locationValue: CodeQualityFindingLocation? = null

    public var location: CodeQualityFindingLocation
      get() = requireNotNull(locationValue) { "location is required" }
      set(`value`) {
        locationValue = value
      }

    private var messageValue: CodeQualityFindingMessage? = null

    public var message: CodeQualityFindingMessage
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var ruleValue: CodeQualityFindingRule? = null

    public var rule: CodeQualityFindingRule
      get() = requireNotNull(ruleValue) { "rule is required" }
      set(`value`) {
        ruleValue = value
      }

    private var stateValue: InlineCodeQualityFindingStateXbc1d5a53? = null

    public var state: InlineCodeQualityFindingStateXbc1d5a53
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * The time the code quality finding was created.
     */
    public var createdAt: String? = null

    public fun build(): CodeQualityFinding {
      check(locationValue != null) { "location is required" }
      check(messageValue != null) { "message is required" }
      check(numberValue != null) { "number is required" }
      check(ruleValue != null) { "rule is required" }
      check(stateValue != null) { "state is required" }
      check(urlValue != null) { "url is required" }
      return CodeQualityFinding(
        location = location,
        message = message,
        number = number,
        rule = rule,
        state = state,
        url = url,
        createdAt = createdAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeQualityFinding = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeQualityFinding> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeQualityFinding {
      val jsonDecoder = decoder.requireJsonDecoder("CodeQualityFinding")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeQualityFinding must be a JSON object")
      val location = json.decodeRequired<CodeQualityFindingLocation>(rawObject, "location")
      val message = json.decodeRequired<CodeQualityFindingMessage>(rawObject, "message")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val rule = json.decodeRequired<CodeQualityFindingRule>(rawObject, "rule")
      val state = json.decodeRequired<InlineCodeQualityFindingStateXbc1d5a53>(rawObject, "state")
      val url = json.decodeRequired<String>(rawObject, "url")
      return CodeQualityFinding(
        location = location,
        message = message,
        number = number,
        rule = rule,
        state = state,
        url = url,
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeQualityFinding) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeQualityFinding")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("location", json.encodeToJsonElement(value.location))
        put("message", json.encodeToJsonElement(value.message))
        put("number", json.encodeToJsonElement(value.number))
        put("rule", json.encodeToJsonElement(value.rule))
        put("state", json.encodeToJsonElement(value.state))
        put("url", value.url)
        value.createdAt?.let { put("created_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeQualityFinding(block: CodeQualityFinding.Builder.() -> Unit): CodeQualityFinding = CodeQualityFinding.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeQualityFinding is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
