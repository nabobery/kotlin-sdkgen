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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite-required-status-checks/properties/checks/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suite-required-status-checks/properties/checks/items
 */
@Serializable(with = InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba.Serializer::class)
public class InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba(
  /**
   * The GitHub App associated with the status check.
   */
  public val app: InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261? = null,
  /**
   * The context name of the status check.
   */
  public val context: String? = null,
  /**
   * The unique identifier of the status check.
   */
  public val id: Int? = null,
  /**
   * The state of the status check.
   */
  public val state: String? = null,
  /**
   * The type of the status check.
   */
  public val type: String? = null,
) {
  public class Builder {
    /**
     * The GitHub App associated with the status check.
     */
    public var app: InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261? = null

    /**
     * The context name of the status check.
     */
    public var context: String? = null

    /**
     * The unique identifier of the status check.
     */
    public var id: Int? = null

    /**
     * The state of the status check.
     */
    public var state: String? = null

    /**
     * The type of the status check.
     */
    public var type: String? = null

    public fun build(): InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba = InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba(
      app = app,
      context = context,
      id = id,
      state = state,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba must be a JSON object")
      return InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba(
        app = rawObject["app"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRuleSuiteRequiredStatusChecksChecksItemAppX7ba3b261?>(element) },
        context = rawObject["context"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.app?.let { put("app", json.encodeToJsonElement(it)) }
        value.context?.let { put("context", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", it) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba(block: InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba.Builder.() -> Unit): InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba = InlineRuleSuiteRequiredStatusChecksChecksItemXdbe76fba.build(block)
