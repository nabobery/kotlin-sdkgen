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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/pull
 * _requests/items/properties/head/properties/repo.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/pull
 * _requests/items/properties/head/properties/repo
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe.Serializer::class)
public class InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe(
  public val id: Int,
  public val name: String,
  public val url: String,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe(
        id = id,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe(
        id = id,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe(block: InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe.Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe = InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemHeadRepoXea0c2abe is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
