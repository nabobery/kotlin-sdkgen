package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1SourcesPostRequestFormX1a757f24.Serializer::class)
public class InlineV1SourcesPostRequestFormX1a757f24(
  /**
   * Amount associated with the source. This is the amount for which the source will be chargeable once ready. Required
   * for `single_use` sources. Not supported for `receiver` type sources, where charge amount may not be specified until
   * funds land.
   */
  public val amount: Int? = null,
  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with the source. This is
   * the currency for which the source will be chargeable once ready.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * The `Customer` to whom the original source is attached to. Must be set when the original source is not a `Source`
   * (e.g., `Card`).
   */
  public val customer: String? = null,
  expand: List<String>? = null,
  /**
   * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`, `code_verification`,
   * `none`. It is generally inferred unless a type supports multiple flows.
   */
  public val flow: InlineV1SourcesPostRequestFormFlowXa6144934? = null,
  /**
   * Information about a mandate possibility attached to a source object (generally for bank debits) as well as its
   * acceptance status.
   */
  public val mandate: InlineV1SourcesPostRequestFormMandateX2f4d7dcf? = null,
  metadata: Map<String, String>? = null,
  /**
   * The source to share.
   */
  public val originalSource: String? = null,
  /**
   * Information about the owner of the payment instrument that may be used or required by particular source types.
   */
  public val owner: InlineV1SourcesPostRequestFormOwnerXced83c15? = null,
  /**
   * Optional parameters for the receiver flow. Can be set only if the source is a receiver (`flow` is `receiver`).
   */
  public val `receiver`: InlineV1SourcesPostRequestFormReceiverX0d24f3db? = null,
  /**
   * Parameters required for the redirect flow. Required if the source is authenticated by a redirect (`flow` is
   * `redirect`).
   */
  public val redirect: InlineV1SourcesPostRequestFormRedirectXd9dd931b? = null,
  /**
   * Information about the items and shipping associated with the source. Required for transactional credit (for example
   * Klarna) sources before you can charge it.
   */
  public val sourceOrder: InlineV1SourcesPostRequestFormSourceOrderXbff41e36? = null,
  /**
   * An arbitrary string to be displayed on your customer's statement. As an example, if your website is `RunClub` and
   * the item you're charging for is a race ticket, you may want to specify a `statement_descriptor` of `RunClub 5K race
   * ticket.` While many payment types will display this information, some may not display it at all.
   */
  public val statementDescriptor: String? = null,
  /**
   * An optional token used to create the source. When passed, token properties will override source parameters.
   */
  public val token: String? = null,
  /**
   * The `type` of the source to create. Required unless `customer` and `original_source` are specified (see the
   * [Cloning card Sources](https://docs.stripe.com/sources/connect#cloning-card-sources) guide)
   */
  public val type: String? = null,
  public val usage: InlineV1SourcesPostRequestFormUsageXb0573f22? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * Amount associated with the source. This is the amount for which the source will be chargeable once ready.
     * Required for `single_use` sources. Not supported for `receiver` type sources, where charge amount may not be
     * specified until funds land.
     */
    public var amount: Int? = null

    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with the source. This is
     * the currency for which the source will be chargeable once ready.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * The `Customer` to whom the original source is attached to. Must be set when the original source is not a `Source`
     * (e.g., `Card`).
     */
    public var customer: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`, `code_verification`,
     * `none`. It is generally inferred unless a type supports multiple flows.
     */
    public var flow: InlineV1SourcesPostRequestFormFlowXa6144934? = null

    /**
     * Information about a mandate possibility attached to a source object (generally for bank debits) as well as its
     * acceptance status.
     */
    public var mandate: InlineV1SourcesPostRequestFormMandateX2f4d7dcf? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The source to share.
     */
    public var originalSource: String? = null

    /**
     * Information about the owner of the payment instrument that may be used or required by particular source types.
     */
    public var owner: InlineV1SourcesPostRequestFormOwnerXced83c15? = null

    /**
     * Optional parameters for the receiver flow. Can be set only if the source is a receiver (`flow` is `receiver`).
     */
    public var `receiver`: InlineV1SourcesPostRequestFormReceiverX0d24f3db? = null

    /**
     * Parameters required for the redirect flow. Required if the source is authenticated by a redirect (`flow` is
     * `redirect`).
     */
    public var redirect: InlineV1SourcesPostRequestFormRedirectXd9dd931b? = null

    /**
     * Information about the items and shipping associated with the source. Required for transactional credit (for
     * example Klarna) sources before you can charge it.
     */
    public var sourceOrder: InlineV1SourcesPostRequestFormSourceOrderXbff41e36? = null

    /**
     * An arbitrary string to be displayed on your customer's statement. As an example, if your website is `RunClub` and
     * the item you're charging for is a race ticket, you may want to specify a `statement_descriptor` of `RunClub 5K
     * race ticket.` While many payment types will display this information, some may not display it at all.
     */
    public var statementDescriptor: String? = null

    /**
     * An optional token used to create the source. When passed, token properties will override source parameters.
     */
    public var token: String? = null

    /**
     * The `type` of the source to create. Required unless `customer` and `original_source` are specified (see the
     * [Cloning card Sources](https://docs.stripe.com/sources/connect#cloning-card-sources) guide)
     */
    public var type: String? = null

    public var usage: InlineV1SourcesPostRequestFormUsageXb0573f22? = null

    public fun build(): InlineV1SourcesPostRequestFormX1a757f24 = InlineV1SourcesPostRequestFormX1a757f24(
      amount = amount,
      currency = currency,
      customer = customer,
      expand = expand,
      flow = flow,
      mandate = mandate,
      metadata = metadata,
      originalSource = originalSource,
      owner = owner,
      receiver = receiver,
      redirect = redirect,
      sourceOrder = sourceOrder,
      statementDescriptor = statementDescriptor,
      token = token,
      type = type,
      usage = usage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormX1a757f24 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormX1a757f24> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormX1a757f24 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormX1a757f24")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormX1a757f24 must be a JSON object")
      return InlineV1SourcesPostRequestFormX1a757f24(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        flow = rawObject["flow"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormFlowXa6144934>(it) },
        mandate = rawObject["mandate"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateX2f4d7dcf>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        originalSource = rawObject["original_source"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormOwnerXced83c15>(it) },
        receiver = rawObject["receiver"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormReceiverX0d24f3db>(it) },
        redirect = rawObject["redirect"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormRedirectXd9dd931b>(it) },
        sourceOrder = rawObject["source_order"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormSourceOrderXbff41e36>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        token = rawObject["token"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormUsageXb0573f22>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormX1a757f24) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormX1a757f24")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customer?.let { put("customer", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.flow?.let { put("flow", json.encodeToJsonElement(it)) }
        value.mandate?.let { put("mandate", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.originalSource?.let { put("original_source", it) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.receiver?.let { put("receiver", json.encodeToJsonElement(it)) }
        value.redirect?.let { put("redirect", json.encodeToJsonElement(it)) }
        value.sourceOrder?.let { put("source_order", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.token?.let { put("token", it) }
        value.type?.let { put("type", it) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormX1a757f24(block: InlineV1SourcesPostRequestFormX1a757f24.Builder.() -> Unit): InlineV1SourcesPostRequestFormX1a757f24 = InlineV1SourcesPostRequestFormX1a757f24.build(block)
