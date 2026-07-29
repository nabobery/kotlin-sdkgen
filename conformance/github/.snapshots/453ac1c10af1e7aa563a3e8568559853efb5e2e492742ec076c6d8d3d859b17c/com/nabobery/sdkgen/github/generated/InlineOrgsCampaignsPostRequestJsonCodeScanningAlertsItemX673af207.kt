package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1campaigns/post/requestBody/content/application~1json/schema/proper
 * ties/code_scanning_alerts/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1campaigns/post/requestBody/content/application~1json/schema/proper
 * ties/code_scanning_alerts/items
 */
@Serializable(with = InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207.Serializer::class)
public class InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207(
  alertNumbers: List<Int>,
  /**
   * The repository id
   */
  public val repositoryId: Int,
) {
  /**
   * The alert numbers
   */
  public val alertNumbers: List<Int> = alertNumbers.toList()

  public class Builder {
    private var alertNumbersValue: List<Int>? = null

    public var alertNumbers: List<Int>
      get() = requireNotNull(alertNumbersValue) { "alertNumbers is required" }.toList()
      set(`value`) {
        alertNumbersValue = value.toList()
      }

    private var repositoryIdValue: Int? = null

    public var repositoryId: Int
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    public fun build(): InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207 {
      check(alertNumbersValue != null) { "alertNumbers is required" }
      check(repositoryIdValue != null) { "repositoryId is required" }
      return InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207(
        alertNumbers = alertNumbers,
        repositoryId = repositoryId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207 must be a JSON object")
      val alertNumbers = json.decodeRequired<List<Int>>(rawObject, "alert_numbers")
      val repositoryId = json.decodeRequired<Int>(rawObject, "repository_id")
      return InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207(
        alertNumbers = alertNumbers,
        repositoryId = repositoryId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alert_numbers", json.encodeToJsonElement(value.alertNumbers))
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207(block: InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207.Builder.() -> Unit): InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207 = InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCampaignsPostRequestJsonCodeScanningAlertsItemX673af207 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
